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