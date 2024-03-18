package N9;

import S9.i;
import fa.C2969F;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes.dex */
public final class b extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12754Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c f12755Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(1);
        this.f12754Y = i10;
        this.f12755Z = cVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        c cVar = this.f12755Z;
        int i10 = this.f12754Y;
        switch (i10) {
            case 0:
                C2969F c2969f = (C2969F) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("it", c2969f);
                        return new S9.e(c2969f, cVar.f12756a);
                    default:
                        AbstractC3557B.c0("it", c2969f);
                        return new i(c2969f, cVar.f12757b);
                }
            default:
                C2969F c2969f2 = (C2969F) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("it", c2969f2);
                        return new S9.e(c2969f2, cVar.f12756a);
                    default:
                        AbstractC3557B.c0("it", c2969f2);
                        return new i(c2969f2, cVar.f12757b);
                }
        }
    }
}
