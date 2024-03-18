package ob;

import id.AbstractC3557B;
import kb.C4209C;
import kb.C4213G;
import kotlin.jvm.internal.o;
import wf.n;

/* renamed from: ob.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4983a extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public static final C4983a f41205Y = new o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        C4209C c4209c = (C4209C) obj;
        C4213G c4213g = (C4213G) obj2;
        AbstractC3557B.c0("$this$setOnEach", c4209c);
        AbstractC3557B.c0("imageSelection", c4213g);
        boolean z11 = c4213g.f37239c;
        if (z11) {
            z10 = true;
        } else {
            z10 = c4209c.f37230h;
        }
        return C4209C.e(c4209c, c4213g.f37237a, c4213g.f37238b, 0, z11, z10, 43);
    }
}
