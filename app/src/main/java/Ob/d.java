package ob;

import id.AbstractC3557B;
import kb.AbstractC4232q;
import kb.C4209C;
import kb.C4229n;
import kb.C4230o;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class d extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41215Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4232q f41216Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AbstractC4232q abstractC4232q, int i10) {
        super(1);
        this.f41215Y = i10;
        this.f41216Z = abstractC4232q;
    }

    public final C4209C a(C4209C c4209c) {
        int i10 = this.f41215Y;
        AbstractC4232q abstractC4232q = this.f41216Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", c4209c);
                return C4209C.e(c4209c, null, 0, 0, false, ((C4230o) abstractC4232q).f37263a, 127);
            default:
                AbstractC3557B.c0("$this$setState", c4209c);
                return C4209C.e(c4209c, null, 0, ((C4229n) abstractC4232q).f37262a, false, false, 223);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f41215Y) {
            case 0:
                return a((C4209C) obj);
            default:
                return a((C4209C) obj);
        }
    }
}
