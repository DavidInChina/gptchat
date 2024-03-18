package ji;

import fi.C3100a;
import id.AbstractC3557B;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: classes.dex */
public final class y extends x {
    public static Long m(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis == 0) {
            return null;
        }
        return valueOf;
    }

    @Override // ji.x, ji.AbstractC4141p
    public final void b(C4113B c4113b, C4113B c4113b2) {
        AbstractC3557B.c0("source", c4113b);
        AbstractC3557B.c0("target", c4113b2);
        try {
            Files.move(c4113b.f(), c4113b2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // ji.x, ji.AbstractC4141p
    public final C4140o i(C4113B c4113b) {
        Path path;
        C4113B c4113b2;
        Long l10;
        Long l11;
        AbstractC3557B.c0("path", c4113b);
        Path f6 = c4113b.f();
        Long l12 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(f6, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (readAttributes.isSymbolicLink()) {
                path = Files.readSymbolicLink(f6);
            } else {
                path = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path != null) {
                String str = C4113B.f36660Z;
                c4113b2 = C3100a.f(path.toString(), false);
            } else {
                c4113b2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l10 = m(creationTime);
            } else {
                l10 = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l11 = m(lastModifiedTime);
            } else {
                l11 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l12 = m(lastAccessTime);
            }
            return new C4140o(isRegularFile, isDirectory, c4113b2, valueOf, l10, l11, l12);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // ji.x
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
