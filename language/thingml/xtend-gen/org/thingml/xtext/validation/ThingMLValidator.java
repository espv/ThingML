/**
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.validation;

import java.util.HashSet;
import java.util.LinkedList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.validation.AbstractThingMLValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class ThingMLValidator extends AbstractThingMLValidator {
  /**
   * CUSTOM VALIDATION RULES FOR THINGS
   */
  @Check
  public void checkNoCyclesInThingIncludes(final Thing thing) {
    EList<Thing> _includes = thing.getIncludes();
    boolean _isEmpty = _includes.isEmpty();
    if (_isEmpty) {
      return;
    }
    final HashSet<Thing> visitedThings = CollectionLiterals.<Thing>newHashSet(thing);
    LinkedList<Thing> toCheck = new LinkedList<Thing>();
    EList<Thing> _includes_1 = thing.getIncludes();
    toCheck.addAll(_includes_1);
    while ((!toCheck.isEmpty())) {
      {
        final Thing current = toCheck.pollFirst();
        boolean _contains = visitedThings.contains(current);
        if (_contains) {
          String _name = current.getName();
          String _plus = ("Cycle in the hierarchy of Thing \'" + _name);
          String _plus_1 = (_plus + "\'");
          EReference _thing_Includes = ThingMLPackage.eINSTANCE.getThing_Includes();
          this.error(_plus_1, _thing_Includes);
          return;
        }
        visitedThings.add(current);
        EList<Thing> _includes_2 = current.getIncludes();
        for (final Thing t : _includes_2) {
          boolean _contains_1 = toCheck.contains(t);
          boolean _not = (!_contains_1);
          if (_not) {
            toCheck.add(t);
          }
        }
      }
    }
  }
}