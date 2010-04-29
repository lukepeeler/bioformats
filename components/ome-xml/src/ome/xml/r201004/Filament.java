/*
 * ome.xml.r201004.Filament
 *
 *-----------------------------------------------------------------------------
 *
 *  Copyright (C) @year@ Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee,
 *      University of Wisconsin-Madison
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *-----------------------------------------------------------------------------
 */

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by callan via xsd-fu on 2010-04-29 09:45:43+0100
 *
 *-----------------------------------------------------------------------------
 */

package ome.xml.r201004;

import java.util.ArrayList;
import java.util.List;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ome.xml.r201004.enums.*;
import ome.xml.r201004.primitives.*;

public class Filament extends LightSource
{
	// -- Constants --

	public static final String NAMESPACE = "http://www.openmicroscopy.org/Schemas/OME/2010-04";

	// -- Instance variables --

	// Property
	private FilamentType type;

	// -- Constructors --

	/** Default constructor. */
	public Filament()
	{
		super();
	}

	/** 
	 * Constructs Filament recursively from an XML DOM tree.
	 * @param element Root of the XML DOM tree to construct a model object
	 * graph from.
	 * @param model Handler for the OME model which keeps track of instances
	 * and references seen during object population.
	 * @throws EnumerationException If there is an error instantiating an
	 * enumeration during model object creation.
	 */
	public Filament(Element element, OMEModel model)
	    throws EnumerationException
	{
		update(element, model);
	}

	// -- Custom content from Filament specific template --


	// -- OMEModelObject API methods --

	/** 
	 * Updates Filament recursively from an XML DOM tree. <b>NOTE:</b> No
	 * properties are removed, only added or updated.
	 * @param element Root of the XML DOM tree to construct a model object
	 * graph from.
	 * @param model Handler for the OME model which keeps track of instances
	 * and references seen during object population.
	 * @throws EnumerationException If there is an error instantiating an
	 * enumeration during model object creation.
	 */
	public void update(Element element, OMEModel model)
	    throws EnumerationException
	{
		super.update(element, model);
		String tagName = element.getTagName();
		if (!"Filament".equals(tagName))
		{
			System.err.println(String.format(
					"WARNING: Expecting node name of Filament got %s",
					tagName));
			// TODO: Should be its own Exception
			//throw new RuntimeException(String.format(
			//		"Expecting node name of Filament got %s",
			//		tagName));
		}
		if (element.hasAttribute("Type"))
		{
			// Attribute property which is an enumeration Type
			setType(FilamentType.fromString(
					element.getAttribute("Type")));
		}
	}

	// -- Filament API methods --

	public void link(Reference reference, OMEModelObject o)
	{
		// TODO: Should be its own Exception
		throw new RuntimeException(
				"Unable to handle reference of type: " + reference.getClass());
	}


	// Property
	public FilamentType getType()
	{
		return type;
	}

	public void setType(FilamentType type)
	{
		this.type = type;
	}

	public Element asXMLElement(Document document)
	{
		return asXMLElement(document, null);
	}

	protected Element asXMLElement(Document document, Element Filament_element)
	{
		// Creating XML block for Filament
		if (Filament_element == null)
		{
			Filament_element =
					document.createElementNS(NAMESPACE, "Filament");
		}

		if (type != null)
		{
			// Attribute property Type
			Filament_element.setAttribute("Type", type.toString());
		}
		return super.asXMLElement(document, Filament_element);
	}
}
