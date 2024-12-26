def f = new File(basedir, "target/first-directory/first-file.txt")
assert !f.exists()

f = new File(basedir, "target/second-directory/second-file.txt")
assert !f.exists()

f = new File(basedir, "target/third-file.txt")
assert !f.exists()

f = new File(basedir, "target/fourth-file.html")
assert f.text == "<html lang=\"en\"><body>it</body></html>"
