package Bd;

import Ad.m;
import ce.AbstractC2397c;
import f9.C2945A;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f2054a;

    public b(C2945A c2945a) {
        this.f2054a = c2945a;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f2054a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new m((Map) obj);
    }
}
