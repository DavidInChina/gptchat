package M3;

import L3.C0889a;
import Mf.AbstractC1003l;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import hg.AbstractC3423b;
import hg.AbstractC3428g;
import hg.C3430i;
import hg.C3432k;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import xg.K;
import zg.AbstractC6864k;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11536a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3428g f11537b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f11538c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f11539d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f11540e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f11541f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f11542g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f11543h;

    /* renamed from: i  reason: collision with root package name */
    public Object f11544i;

    public I(xg.m mVar, AbstractC3428g abstractC3428g, AbstractC1003l abstractC1003l, C3430i c3430i, C3432k c3432k, AbstractC3423b abstractC3423b, AbstractC6864k abstractC6864k, K k10, List list) {
        String str;
        AbstractC3557B.c0("components", mVar);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("containingDeclaration", abstractC1003l);
        AbstractC3557B.c0("typeTable", c3430i);
        AbstractC3557B.c0("versionRequirementTable", c3432k);
        AbstractC3557B.c0("metadataVersion", abstractC3423b);
        this.f11536a = mVar;
        this.f11537b = abstractC3428g;
        this.f11538c = abstractC1003l;
        this.f11539d = c3430i;
        this.f11540e = c3432k;
        this.f11541f = abstractC3423b;
        this.f11542g = abstractC6864k;
        this.f11543h = new K(this, k10, list, "Deserializer for \"" + abstractC1003l.getName() + '\"', (abstractC6864k == null || (str = abstractC6864k.a()) == null) ? "[container not found]" : str);
        this.f11544i = new xg.z(this);
    }

    public final I a(AbstractC1003l abstractC1003l, List list, AbstractC3428g abstractC3428g, C3430i c3430i, C3432k c3432k, AbstractC3423b abstractC3423b) {
        C3432k c3432k2;
        AbstractC3557B.c0("descriptor", abstractC1003l);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        AbstractC3557B.c0("versionRequirementTable", c3432k);
        AbstractC3557B.c0("metadataVersion", abstractC3423b);
        xg.m mVar = (xg.m) this.f11536a;
        int i10 = abstractC3423b.f32291b;
        if ((i10 == 1 && abstractC3423b.f32292c >= 4) || i10 > 1) {
            c3432k2 = c3432k;
        } else {
            c3432k2 = (C3432k) this.f11540e;
        }
        return new I(mVar, abstractC3428g, abstractC1003l, c3430i, c3432k2, abstractC3423b, (AbstractC6864k) this.f11542g, (K) this.f11543h, list);
    }

    public final Ag.u c() {
        return ((xg.m) this.f11536a).f50010a;
    }

    public I(Context context, C0889a c0889a, X3.b bVar, T3.a aVar, WorkDatabase workDatabase, U3.q qVar, ArrayList arrayList) {
        this.f11544i = new U3.u(17);
        this.f11536a = context.getApplicationContext();
        this.f11539d = bVar;
        this.f11538c = aVar;
        this.f11540e = c0889a;
        this.f11541f = workDatabase;
        this.f11542g = qVar;
        this.f11543h = arrayList;
    }
}
