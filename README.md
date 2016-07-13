# Codename One Android Importer

A tool to import resources from an Android project into a Codename One project

## Usage

~~~~
java -jar AndroidImporter.jar import-project [options]
 -h,--help                         Usage instructions
 -i,--android-resource-dir <arg>   Android project res directory path
 -o,--cn1-project-dir <arg>        Path to the CN1 output project
                                   directory.
 -p,--package <arg>                Java package to place GUI forms in.
 -r,--cn1-resource-file            Path to CN1 output .res file.  Defaults
                                   to theme.res in project dir
~~~~

**Example running with Test inputs**

~~~~
$ java -jar dist/AndroidImporter.jar import-project -i test_inputs/k9mail -o AndroidImporterTestBed/ -p ca.weblite.testui
~~~~

NOTE:  You'll need to specify the path to ant via the ANT_HOME environment variable or java system property before running this.

## Features

* Imports all localized strings into a resource bundle named "strings" inside the Codename One resource file.
* Imports all images from the Android project into the Codename One resource file.
* Imports all android layouts into the Codename One project as .gui files that can be edited in the Codename One GUI Builder.

## Project Status

This is very early stages, and the result isn't very good.  Importing of strings and images is pretty good, but layouts will only get you to a
starting point from which you'll still need to to quite a bit of work.

