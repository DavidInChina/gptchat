package di;

import id.AbstractC3557B;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class q extends Zh.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f28611e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f28612f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f28613g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f28614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(String str, t tVar, int i10, Object obj, int i11) {
        super(str, true);
        this.f28611e = i11;
        this.f28612f = tVar;
        this.f28613g = i10;
        this.f28614h = obj;
    }

    private void b() {
        this.f28612f.f28639q0.getClass();
        AbstractC3557B.c0("errorCode", (EnumC2728b) this.f28614h);
        synchronized (this.f28612f) {
            this.f28612f.f28627F0.remove(Integer.valueOf(this.f28613g));
        }
    }

    @Override // Zh.a
    public final long a() {
        switch (this.f28611e) {
            case 0:
                b();
                return -1L;
            case 1:
                t tVar = this.f28612f;
                try {
                    int i10 = this.f28613g;
                    EnumC2728b enumC2728b = (EnumC2728b) this.f28614h;
                    tVar.getClass();
                    AbstractC3557B.c0("statusCode", enumC2728b);
                    tVar.f28625D0.p(i10, enumC2728b);
                } catch (IOException e10) {
                    tVar.h(e10);
                }
                return -1L;
            default:
                this.f28612f.f28639q0.getClass();
                AbstractC3557B.c0("requestHeaders", (List) this.f28614h);
                try {
                    this.f28612f.f28625D0.p(this.f28613g, EnumC2728b.CANCEL);
                    synchronized (this.f28612f) {
                        this.f28612f.f28627F0.remove(Integer.valueOf(this.f28613g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
        }
    }
}
