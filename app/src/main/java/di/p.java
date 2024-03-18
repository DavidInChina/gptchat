package di;

import id.AbstractC3557B;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class p extends Zh.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f28608e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f28609f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f28610g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, t tVar, int i10, List list, boolean z10) {
        super(str, true);
        this.f28608e = tVar;
        this.f28609f = i10;
        this.f28610g = list;
    }

    @Override // Zh.a
    public final long a() {
        P5.c cVar = this.f28608e.f28639q0;
        List list = this.f28610g;
        cVar.getClass();
        AbstractC3557B.c0("responseHeaders", list);
        try {
            this.f28608e.f28625D0.p(this.f28609f, EnumC2728b.CANCEL);
            synchronized (this.f28608e) {
                this.f28608e.f28627F0.remove(Integer.valueOf(this.f28609f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
