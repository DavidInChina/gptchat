package di;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class k extends Zh.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f28593e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f28594f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f28595g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, t tVar, Object obj, int i10) {
        super(str, true);
        this.f28593e = i10;
        this.f28594f = tVar;
        this.f28595g = obj;
    }

    @Override // Zh.a
    public final long a() {
        switch (this.f28593e) {
            case 0:
                t tVar = this.f28594f;
                tVar.f28629Z.a(tVar, (E) ((kotlin.jvm.internal.B) this.f28595g).f37622Y);
                return -1L;
            default:
                try {
                    this.f28594f.f28629Z.b((C2724A) this.f28595g);
                } catch (IOException e10) {
                    ei.m mVar = ei.m.f29511a;
                    ei.m.f29511a.getClass();
                    ei.m.i(4, "Http2Connection.Listener failure for " + this.f28594f.f28631i0, e10);
                    try {
                        ((C2724A) this.f28595g).c(EnumC2728b.PROTOCOL_ERROR, e10);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
        }
    }
}
