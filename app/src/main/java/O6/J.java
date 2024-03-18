package o6;

import id.AbstractC3557B;
import m6.C4562a;
import r6.AbstractC5369a;
import r6.C5370b;

/* loaded from: classes2.dex */
public final class J extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40654Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4562a f40655Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(C4562a c4562a, int i10) {
        super(1);
        this.f40654Y = i10;
        this.f40655Z = c4562a;
    }

    public final void a(AbstractC5369a abstractC5369a) {
        r6.g gVar = r6.g.f44458f;
        r6.d dVar = r6.d.f44455f;
        int i10 = this.f40654Y;
        String str = "";
        C4562a c4562a = this.f40655Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", abstractC5369a);
                String str2 = c4562a.f38948d;
                if (str2 != null) {
                    str = str2;
                }
                ((C5370b) abstractC5369a).a(str, dVar);
                return;
            case 1:
                AbstractC3557B.c0("it", abstractC5369a);
                String str3 = c4562a.f38948d;
                if (str3 != null) {
                    str = str3;
                }
                ((C5370b) abstractC5369a).b(str, dVar);
                return;
            case 2:
                AbstractC3557B.c0("it", abstractC5369a);
                String str4 = c4562a.f38948d;
                if (str4 != null) {
                    str = str4;
                }
                ((C5370b) abstractC5369a).a(str, gVar);
                return;
            case 3:
                AbstractC3557B.c0("it", abstractC5369a);
                String str5 = c4562a.f38948d;
                if (str5 != null) {
                    str = str5;
                }
                ((C5370b) abstractC5369a).b(str, gVar);
                return;
            case 4:
                AbstractC3557B.c0("it", abstractC5369a);
                String str6 = c4562a.f38948d;
                if (str6 != null) {
                    str = str6;
                }
                ((C5370b) abstractC5369a).a(str, dVar);
                return;
            default:
                AbstractC3557B.c0("it", abstractC5369a);
                String str7 = c4562a.f38948d;
                if (str7 != null) {
                    str = str7;
                }
                ((C5370b) abstractC5369a).b(str, dVar);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40654Y) {
            case 0:
                a((AbstractC5369a) obj);
                return yVar;
            case 1:
                a((AbstractC5369a) obj);
                return yVar;
            case 2:
                a((AbstractC5369a) obj);
                return yVar;
            case 3:
                a((AbstractC5369a) obj);
                return yVar;
            case 4:
                a((AbstractC5369a) obj);
                return yVar;
            default:
                a((AbstractC5369a) obj);
                return yVar;
        }
    }
}
