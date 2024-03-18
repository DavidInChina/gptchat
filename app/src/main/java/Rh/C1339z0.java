package Rh;

import java.lang.annotation.Annotation;
import java.util.Map;
import th.AbstractC5798f;
import th.C5794b;
import yh.C6641v;

/* renamed from: Rh.z0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1339z0 extends B0 implements AbstractC5798f {

    /* renamed from: h  reason: collision with root package name */
    public final Class f15965h;

    public C1339z0(p1 p1Var, Class cls, Map map) {
        super(p1Var, C6641v.l1(cls), map);
        this.f15965h = cls;
    }

    @Override // th.AbstractC5798f
    public final Annotation a() {
        Class cls = this.f15965h;
        return C5794b.a(cls.getClassLoader(), cls, this.f15602g);
    }

    @Override // Rh.B0, th.AbstractC5802j
    public final /* bridge */ /* synthetic */ AbstractC5798f b(Class cls) {
        return b(cls);
    }
}
