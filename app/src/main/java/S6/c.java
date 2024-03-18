package s6;

import F5.h;
import id.AbstractC3557B;
import java.util.concurrent.TimeUnit;
import n6.C4719c;
import p5.AbstractC5091c;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final long f45418c = TimeUnit.HOURS.toMillis(4);

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f45419a;

    /* renamed from: b  reason: collision with root package name */
    public final h f45420b;

    public c(AbstractC5091c abstractC5091c) {
        C4719c c4719c = new C4719c(abstractC5091c);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f45419a = abstractC5091c;
        this.f45420b = c4719c;
    }
}
