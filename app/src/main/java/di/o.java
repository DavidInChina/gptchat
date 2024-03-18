package di;

import id.AbstractC3557B;
import java.io.IOException;
import ji.C4135j;

/* loaded from: classes2.dex */
public final class o extends Zh.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f28604e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f28605f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C4135j f28606g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f28607h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, t tVar, int i10, C4135j c4135j, int i11, boolean z10) {
        super(str, true);
        this.f28604e = tVar;
        this.f28605f = i10;
        this.f28606g = c4135j;
        this.f28607h = i11;
    }

    @Override // Zh.a
    public final long a() {
        try {
            P5.c cVar = this.f28604e.f28639q0;
            C4135j c4135j = this.f28606g;
            int i10 = this.f28607h;
            cVar.getClass();
            AbstractC3557B.c0("source", c4135j);
            c4135j.skip(i10);
            this.f28604e.f28625D0.p(this.f28605f, EnumC2728b.CANCEL);
            synchronized (this.f28604e) {
                this.f28604e.f28627F0.remove(Integer.valueOf(this.f28605f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
