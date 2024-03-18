package yc;

import Vc.m;
import d9.h;
import java.util.Set;
import jf.C3963m;
import me.x;
import wd.C6189g;
import wf.k;

/* renamed from: yc.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6578d implements Xc.d {

    /* renamed from: c  reason: collision with root package name */
    public static final Set f50895c = R4.b.X1(m.f18553a, m.f18554b);

    /* renamed from: a  reason: collision with root package name */
    public C6189g f50896a;

    /* renamed from: b  reason: collision with root package name */
    public final C3963m f50897b = R4.b.D1(new h(28, this));

    public final synchronized void a(k kVar) {
        this.f50896a = (C6189g) kVar.invoke(this.f50896a);
    }

    @Override // Xc.c
    public final x b() {
        return (x) this.f50897b.getValue();
    }
}
