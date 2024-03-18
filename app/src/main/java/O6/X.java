package o6;

import id.AbstractC3557B;
import m6.C4562a;
import r6.AbstractC5369a;
import r6.C5370b;

/* loaded from: classes2.dex */
public final class X extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40736Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4562a f40737Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r.f f40738h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(C4562a c4562a, r.f fVar, int i10) {
        super(1);
        this.f40736Y = i10;
        this.f40737Z = c4562a;
        this.f40738h0 = fVar;
    }

    public final void a(AbstractC5369a abstractC5369a) {
        int i10 = this.f40736Y;
        r.f fVar = this.f40738h0;
        String str = "";
        C4562a c4562a = this.f40737Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", abstractC5369a);
                String str2 = c4562a.f38948d;
                if (str2 != null) {
                    str = str2;
                }
                ((C5370b) abstractC5369a).a(str, fVar);
                return;
            default:
                AbstractC3557B.c0("it", abstractC5369a);
                String str3 = c4562a.f38948d;
                if (str3 != null) {
                    str = str3;
                }
                ((C5370b) abstractC5369a).b(str, fVar);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40736Y) {
            case 0:
                a((AbstractC5369a) obj);
                return yVar;
            default:
                a((AbstractC5369a) obj);
                return yVar;
        }
    }
}
