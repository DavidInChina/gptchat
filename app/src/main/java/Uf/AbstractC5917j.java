package uf;

import Lg.n;
import id.AbstractC3557B;
import java.io.File;
import q1.AbstractC5260f;

/* renamed from: uf.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5917j extends AbstractC5260f {
    public static boolean Z(File file) {
        AbstractC3557B.c0("<this>", file);
        EnumC5916i enumC5916i = EnumC5916i.f46760Y;
        C5913f c5913f = new C5913f(new C5915h(file));
        while (true) {
            boolean z10 = true;
            while (c5913f.hasNext()) {
                File file2 = (File) c5913f.next();
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                        break;
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    public static File a0(File file, String str) {
        String file2;
        File file3;
        int i10;
        int k22;
        File file4 = new File(str);
        String path = file4.getPath();
        AbstractC3557B.b0("getPath(...)", path);
        char c10 = File.separatorChar;
        int k23 = n.k2(path, c10, 0, false, 4);
        if (k23 == 0) {
            if (path.length() > 1 && path.charAt(1) == c10 && (k22 = n.k2(path, c10, 2, false, 4)) >= 0) {
                int k24 = n.k2(path, c10, k22 + 1, false, 4);
                if (k24 >= 0) {
                    i10 = k24 + 1;
                } else {
                    i10 = path.length();
                }
            } else {
                return file4;
            }
        } else if (k23 > 0 && path.charAt(k23 - 1) == ':') {
            i10 = k23 + 1;
        } else {
            if (k23 == -1 && n.d2(path, ':')) {
                i10 = path.length();
            }
            file2 = file.toString();
            AbstractC3557B.b0("toString(...)", file2);
            if (file2.length() == 0 || n.d2(file2, c10)) {
                file3 = new File(file2 + file4);
            } else {
                file3 = new File(file2 + c10 + file4);
            }
            return file3;
        }
        if (i10 > 0) {
            return file4;
        }
        file2 = file.toString();
        AbstractC3557B.b0("toString(...)", file2);
        if (file2.length() == 0) {
            file3 = new File(file2 + c10 + file4);
            return file3;
        }
        file3 = new File(file2 + file4);
        return file3;
    }
}
