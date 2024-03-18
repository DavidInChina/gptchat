package i9;

import dd.AbstractC2625a;
import id.AbstractC3557B;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ld.C4431d;

/* renamed from: i9.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3514f {

    /* renamed from: a  reason: collision with root package name */
    public final C4431d f32889a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f32890b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC2625a f32891c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f32892d = new AtomicBoolean(false);

    public C3514f(C4431d c4431d, Set set, AbstractC2625a abstractC2625a) {
        AbstractC3557B.c0("scope", c4431d);
        AbstractC3557B.c0("initializers", set);
        AbstractC3557B.c0("foregroundDetector", abstractC2625a);
        this.f32889a = c4431d;
        this.f32890b = set;
        this.f32891c = abstractC2625a;
    }
}
