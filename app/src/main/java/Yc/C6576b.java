package yc;

import Vc.m;
import d9.h;
import java.util.Set;
import jf.C3963m;
import me.x;
import nd.C4812a;

/* renamed from: yc.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6576b implements Xc.a {

    /* renamed from: d  reason: collision with root package name */
    public static final Set f50890d = R4.b.X1(m.f18553a, m.f18554b);

    /* renamed from: a  reason: collision with root package name */
    public final C4812a f50891a;

    /* renamed from: b  reason: collision with root package name */
    public final String f50892b;

    /* renamed from: c  reason: collision with root package name */
    public final C3963m f50893c = R4.b.D1(new h(27, this));

    public C6576b(C4812a c4812a) {
        this.f50891a = c4812a;
        this.f50892b = c4812a.f40276c;
    }

    @Override // Xc.c
    public final x b() {
        return (x) this.f50893c.getValue();
    }
}
