package nl.rubensten.texifyidea;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * @author Ruben Schellekens, Sten Wessel
 */
public class TexifyIcons {

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon LATEX_FILE = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/latex-file.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon PDF_FILE = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/pdf-file.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon BIBLIOGRAPHY_FILE = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/bibliography-file.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon CLASS_FILE = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/class-file.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon DOCUMENTED_LATEX_SOURCE = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/doc-latex-file.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon STYLE_FILE = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/style-file.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon FILE = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/file.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon TEXT_FILE = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/text-file.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon BUILD = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/build.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon LATEX_MODULE = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/latex-module.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon DOT_LATEX = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/dot-tex.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon DOT_COMMAND = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/dot-cmd.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon DOT_LABEL = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/dot-lbl.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon DOT_INCLUDE = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/dot-incl.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon DOT_SECTION = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/dot-sec.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon DOT_SUBSECTION = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/dot-subsec.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon DOT_SUBSUBSECTION = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/dot-subsubsec.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon DOT_PARAGRAPH = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/dot-par.png"
    );

    /**
     * Copyright (c) 2017 Ruben Schellekens
     */
    public static final Icon DOT_SUBPARAGRAPH = IconLoader.getIcon(
            "/nl/rubensten/texifyidea/icons/dot-subpar.png"
    );

    /**
     * Get the file icon object that corresponds to the given file extension.
     * <p>
     * This method ignores case.
     *
     * @param extension
     *         The extension of the file to get the icon of without a dot.
     * @return The Icon that corresponds to the given extension.
     * @throws IllegalArgumentException
     *         When {@code extension} is null.
     */
    public static Icon getIconFromExtension(String extension) {
        if (extension == null) {
            return FILE;
        }

        switch (extension.toLowerCase()) {
            case "tex":
                return LATEX_FILE;
            case "bib":
                return BIBLIOGRAPHY_FILE;
            case "cls":
                return CLASS_FILE;
            case "dtx":
                return DOCUMENTED_LATEX_SOURCE;
            case "sty":
                return STYLE_FILE;
            case "txt":
                return TEXT_FILE;
            case "log":
                return TEXT_FILE;
            case "pdf":
                return PDF_FILE;
            default:
                return FILE;
        }
    }
}
