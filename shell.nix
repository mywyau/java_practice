{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = [
    pkgs.openjdk21
  ];

  shellHook = ''
    echo "Java 21 environment activated!"
    java -version
  '';
}
