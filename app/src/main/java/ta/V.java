package ta;

import android.net.Uri;
import id.AbstractC3557B;
import jf.C3959i;
import kf.AbstractC4268D;
import za.C6786c;
import za.C6807x;

/* loaded from: classes2.dex */
public final class V extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45855Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Uri f45856Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6786c f45857h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(Uri uri, C6786c c6786c, int i10) {
        super(1);
        this.f45855Y = i10;
        this.f45856Z = uri;
        this.f45857h0 = c6786c;
    }

    public final C6807x a(C6807x c6807x) {
        int i10 = this.f45855Y;
        C6786c c6786c = this.f45857h0;
        Uri uri = this.f45856Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$update", c6807x);
                return C6807x.a(c6807x, null, AbstractC4268D.g1(c6807x.f51805b, new C3959i(uri, c6786c)), null, false, null, 29);
            default:
                AbstractC3557B.c0("$this$update", c6807x);
                return C6807x.a(c6807x, null, P4.a.o0(new C3959i(uri, c6786c)), null, false, null, 29);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f45855Y) {
            case 0:
                return a((C6807x) obj);
            default:
                return a((C6807x) obj);
        }
    }
}
