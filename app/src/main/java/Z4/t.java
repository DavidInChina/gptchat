package z4;

import Ng.AbstractC1070k;
import Ng.C1072l;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class t implements v4.n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f51710a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC1070k f51711b;

    public /* synthetic */ t(int i10, C1072l c1072l) {
        this.f51710a = i10;
        this.f51711b = c1072l;
    }

    @Override // v4.n
    public final void a(Object obj) {
        int i10 = this.f51710a;
        AbstractC1070k abstractC1070k = this.f51711b;
        switch (i10) {
            case 0:
                if (!abstractC1070k.j()) {
                    abstractC1070k.resumeWith(obj);
                    return;
                }
                return;
            default:
                Throwable th2 = (Throwable) obj;
                if (!abstractC1070k.j()) {
                    AbstractC3557B.Z(th2);
                    abstractC1070k.resumeWith(N.w(th2));
                    return;
                }
                return;
        }
    }
}
