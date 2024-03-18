package sd;

import id.AbstractC3557B;
import ld.C4428a;
import ld.q;
import nd.C4812a;
import rd.C5477a;

/* renamed from: sd.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5613b {

    /* renamed from: a  reason: collision with root package name */
    public final C5477a f45531a;

    /* renamed from: b  reason: collision with root package name */
    public final C4428a f45532b;

    /* renamed from: c  reason: collision with root package name */
    public final C4812a f45533c;

    /* renamed from: d  reason: collision with root package name */
    public final q f45534d;

    public C5613b(C5477a c5477a, C4428a c4428a, C4812a c4812a, q qVar) {
        AbstractC3557B.c0("fileProvider", c5477a);
        AbstractC3557B.c0("accountUserCoroutineScope", c4428a);
        AbstractC3557B.c0("accountSession", c4812a);
        AbstractC3557B.c0("deletionReleaseCompletable", qVar);
        this.f45531a = c5477a;
        this.f45532b = c4428a;
        this.f45533c = c4812a;
        this.f45534d = qVar;
    }
}
