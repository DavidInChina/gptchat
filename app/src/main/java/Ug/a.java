package Ug;

import Sg.m;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.k;
import nf.AbstractC4831k;
import wf.o;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends k implements o {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f17852Y = new k(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        g gVar = (g) obj2;
        long j6 = bVar.f17853a;
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        y yVar = y.f36177a;
        if (i10 <= 0) {
            ((f) gVar).f17876j0 = yVar;
        } else {
            m mVar = new m(gVar, bVar);
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>", gVar);
            f fVar = (f) gVar;
            f fVar2 = (f) gVar;
            AbstractC4831k abstractC4831k = fVar2.f17872Y;
            fVar2.f17874h0 = R4.b.h1(abstractC4831k).i(j6, mVar, abstractC4831k);
        }
        return yVar;
    }
}
