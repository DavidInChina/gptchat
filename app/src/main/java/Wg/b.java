package Wg;

import jf.y;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class b extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21088Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ d f21089Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ c f21090h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i10) {
        super(1);
        this.f21088Y = i10;
        this.f21089Z = dVar;
        this.f21090h0 = cVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        c cVar = this.f21090h0;
        d dVar = this.f21089Z;
        int i10 = this.f21088Y;
        switch (i10) {
            case 0:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 0:
                        dVar.g(cVar.f21092Z);
                        break;
                    default:
                        d.f21094h.set(dVar, cVar.f21092Z);
                        dVar.g(cVar.f21092Z);
                        break;
                }
                return yVar;
            default:
                Throwable th3 = (Throwable) obj;
                switch (i10) {
                    case 0:
                        dVar.g(cVar.f21092Z);
                        break;
                    default:
                        d.f21094h.set(dVar, cVar.f21092Z);
                        dVar.g(cVar.f21092Z);
                        break;
                }
                return yVar;
        }
    }
}
