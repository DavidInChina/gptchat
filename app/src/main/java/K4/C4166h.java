package k4;

import android.webkit.MimeTypeMap;
import fi.C3100a;
import h4.o;
import id.AbstractC3557B;
import java.io.File;
import ji.AbstractC4141p;
import ji.C4113B;
import nf.AbstractC4825e;

/* renamed from: k4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4166h implements AbstractC4165g {

    /* renamed from: a  reason: collision with root package name */
    public final File f37008a;

    public C4166h(File file) {
        this.f37008a = file;
    }

    @Override // k4.AbstractC4165g
    public final Object a(AbstractC4825e abstractC4825e) {
        String str = C4113B.f36660Z;
        File file = this.f37008a;
        o oVar = new o(C3100a.g(file), AbstractC4141p.f36737a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        AbstractC3557B.b0("getName(...)", name);
        return new C4172n(oVar, singleton.getMimeTypeFromExtension(Lg.n.P2('.', name, "")), h4.f.f31881h0);
    }
}
