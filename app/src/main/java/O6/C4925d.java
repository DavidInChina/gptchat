package o6;

import id.AbstractC3557B;
import m6.C4562a;
import r6.AbstractC5369a;
import r6.C5370b;

/* renamed from: o6.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4925d extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40822Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4562a f40823Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r6.c f40824h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4925d(C4562a c4562a, r6.c cVar, int i10) {
        super(1);
        this.f40822Y = i10;
        this.f40823Z = c4562a;
        this.f40824h0 = cVar;
    }

    public final void a(AbstractC5369a abstractC5369a) {
        int i10 = this.f40822Y;
        r6.c cVar = this.f40824h0;
        String str = "";
        C4562a c4562a = this.f40823Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", abstractC5369a);
                String str2 = c4562a.f38948d;
                if (str2 != null) {
                    str = str2;
                }
                ((C5370b) abstractC5369a).a(str, cVar);
                return;
            case 1:
                AbstractC3557B.c0("it", abstractC5369a);
                String str3 = c4562a.f38948d;
                if (str3 != null) {
                    str = str3;
                }
                ((C5370b) abstractC5369a).b(str, cVar);
                return;
            case 2:
                AbstractC3557B.c0("it", abstractC5369a);
                String str4 = c4562a.f38948d;
                if (str4 != null) {
                    str = str4;
                }
                ((C5370b) abstractC5369a).a(str, cVar);
                return;
            default:
                AbstractC3557B.c0("it", abstractC5369a);
                String str5 = c4562a.f38948d;
                if (str5 != null) {
                    str = str5;
                }
                ((C5370b) abstractC5369a).b(str, cVar);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40822Y) {
            case 0:
                a((AbstractC5369a) obj);
                return yVar;
            case 1:
                a((AbstractC5369a) obj);
                return yVar;
            case 2:
                a((AbstractC5369a) obj);
                return yVar;
            default:
                a((AbstractC5369a) obj);
                return yVar;
        }
    }
}
