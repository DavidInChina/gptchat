package k4;

import android.net.Uri;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.C3963m;

/* renamed from: k4.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4167i implements AbstractC4164f {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC3957g f37009a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3957g f37010b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f37011c;

    public C4167i(C3963m c3963m, C3963m c3963m2, boolean z10) {
        this.f37009a = c3963m;
        this.f37010b = c3963m2;
        this.f37011c = z10;
    }

    @Override // k4.AbstractC4164f
    public final AbstractC4165g a(Object obj, q4.n nVar, f4.i iVar) {
        Uri uri = (Uri) obj;
        if (!AbstractC3557B.K(uri.getScheme(), "http") && !AbstractC3557B.K(uri.getScheme(), "https")) {
            return null;
        }
        return new C4170l(uri.toString(), nVar, this.f37009a, this.f37010b, this.f37011c);
    }
}
