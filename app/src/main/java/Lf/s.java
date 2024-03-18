package Lf;

import hg.C3422a;
import id.AbstractC3557B;
import java.io.InputStream;
import kg.C4291c;
import xg.AbstractC6446a;
import yg.C6584a;
import yg.C6587d;
import yg.C6588e;

/* loaded from: classes2.dex */
public final class s extends AbstractC6446a {
    @Override // xg.AbstractC6446a
    public final C6587d d(C4291c c4291c) {
        InputStream inputStream;
        AbstractC3557B.c0("fqName", c4291c);
        Rf.d dVar = (Rf.d) this.f49988b;
        dVar.getClass();
        if (!c4291c.h(Jf.q.f9203j)) {
            inputStream = null;
        } else {
            C6584a.f50909q.getClass();
            String a5 = C6584a.a(c4291c);
            dVar.f15502b.getClass();
            inputStream = C6588e.a(a5);
        }
        if (inputStream == null) {
            return null;
        }
        return C3422a.h(c4291c, this.f49987a, this.f49989c, inputStream);
    }
}
