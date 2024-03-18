package xg;

import Bg.C0223p;
import Mf.AbstractC0997f;
import hg.AbstractC3423b;
import hg.AbstractC3428g;
import hg.C3430i;
import hg.C3432k;
import id.AbstractC3557B;
import java.util.List;
import java.util.Set;
import kg.C4290b;
import l8.AbstractC4344b;
import lg.C4464i;
import tg.C5768a;
import zg.AbstractC6864k;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Ag.u f50010a;

    /* renamed from: b  reason: collision with root package name */
    public final Mf.B f50011b;

    /* renamed from: c  reason: collision with root package name */
    public final o f50012c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC6453h f50013d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC6448c f50014e;

    /* renamed from: f  reason: collision with root package name */
    public final Mf.H f50015f;

    /* renamed from: g  reason: collision with root package name */
    public final w f50016g;

    /* renamed from: h  reason: collision with root package name */
    public final s f50017h;

    /* renamed from: i  reason: collision with root package name */
    public final Tf.c f50018i;

    /* renamed from: j  reason: collision with root package name */
    public final t f50019j;

    /* renamed from: k  reason: collision with root package name */
    public final Iterable f50020k;

    /* renamed from: l  reason: collision with root package name */
    public final U3.i f50021l;

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC6457l f50022m;

    /* renamed from: n  reason: collision with root package name */
    public final Of.b f50023n;

    /* renamed from: o  reason: collision with root package name */
    public final Of.e f50024o;

    /* renamed from: p  reason: collision with root package name */
    public final C4464i f50025p;

    /* renamed from: q  reason: collision with root package name */
    public final Cg.n f50026q;

    /* renamed from: r  reason: collision with root package name */
    public final List f50027r;

    /* renamed from: s  reason: collision with root package name */
    public final r f50028s;

    /* renamed from: t  reason: collision with root package name */
    public final C6455j f50029t;

    public m(Ag.u uVar, Mf.B b10, AbstractC6453h abstractC6453h, AbstractC6448c abstractC6448c, Mf.H h10, s sVar, t tVar, Iterable iterable, U3.i iVar, Of.b bVar, Of.e eVar, C4464i c4464i, Cg.n nVar, C5768a c5768a, List list, r rVar) {
        n nVar2 = n.f50030b;
        n nVar3 = n.f50033e;
        Tf.b bVar2 = Tf.b.f17210a;
        n nVar4 = C6456k.f50009a;
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("moduleDescriptor", b10);
        AbstractC3557B.c0("fictitiousClassDescriptorFactories", iterable);
        AbstractC3557B.c0("additionalClassPartsProvider", bVar);
        AbstractC3557B.c0("platformDependentDeclarationFilter", eVar);
        AbstractC3557B.c0("extensionRegistryLite", c4464i);
        AbstractC3557B.c0("kotlinTypeChecker", nVar);
        AbstractC3557B.c0("typeAttributeTranslators", list);
        AbstractC3557B.c0("enumEntriesDeserializationSupport", rVar);
        this.f50010a = uVar;
        this.f50011b = b10;
        this.f50012c = nVar2;
        this.f50013d = abstractC6453h;
        this.f50014e = abstractC6448c;
        this.f50015f = h10;
        this.f50016g = nVar3;
        this.f50017h = sVar;
        this.f50018i = bVar2;
        this.f50019j = tVar;
        this.f50020k = iterable;
        this.f50021l = iVar;
        this.f50022m = nVar4;
        this.f50023n = bVar;
        this.f50024o = eVar;
        this.f50025p = c4464i;
        this.f50026q = nVar;
        this.f50027r = list;
        this.f50028s = rVar;
        this.f50029t = new C6455j(this);
    }

    public final M3.I a(Mf.G g10, AbstractC3428g abstractC3428g, C3430i c3430i, C3432k c3432k, AbstractC3423b abstractC3423b, AbstractC6864k abstractC6864k) {
        AbstractC3557B.c0("descriptor", g10);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("metadataVersion", abstractC3423b);
        return new M3.I(this, abstractC3428g, g10, c3430i, c3432k, abstractC3423b, abstractC6864k, null, kf.v.f37483Y);
    }

    public final AbstractC0997f b(C4290b c4290b) {
        AbstractC3557B.c0("classId", c4290b);
        Set set = C6455j.f50006c;
        C6455j c6455j = this.f50029t;
        c6455j.getClass();
        return (AbstractC0997f) c6455j.f50008b.invoke(new C6454i(c4290b, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(Ag.u uVar, Mf.B b10, p pVar, C6449d c6449d, Mf.L l10, Iterable iterable, U3.i iVar, Of.b bVar, Of.e eVar, C4464i c4464i, Cg.o oVar, C5768a c5768a, v vVar, int i10) {
        this(uVar, b10, pVar, c6449d, l10, r6, r7, iterable, iVar, bVar, eVar, c4464i, r13, c5768a, AbstractC4344b.F0(C0223p.f2145a), (i10 & 524288) != 0 ? n.f50031c : vVar);
        Cg.o oVar2;
        n nVar = s.f50041a;
        n nVar2 = n.f50032d;
        if ((i10 & 65536) != 0) {
            Cg.n.f3142b.getClass();
            oVar2 = Cg.m.f3141b;
        } else {
            oVar2 = oVar;
        }
    }
}
