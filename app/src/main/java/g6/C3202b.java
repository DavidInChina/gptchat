package g6;

import id.AbstractC3557B;
import java.util.Set;
import kotlin.jvm.internal.o;
import p5.AbstractC5092d;
import wf.n;

/* renamed from: g6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3202b extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public static final C3202b f31285Y = new o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC5092d abstractC5092d = (AbstractC5092d) obj;
        Set set = (Set) obj2;
        AbstractC3557B.c0("sdkCore", abstractC5092d);
        AbstractC3557B.c0("tracingHeaderTypes", set);
        C6.d dVar = new C6.d(abstractC5092d);
        dVar.f2707c = set;
        return dVar.a();
    }
}
