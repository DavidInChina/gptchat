package oe;

import id.AbstractC3557B;
import xe.AbstractC6418g;
import xe.C6417f;

/* renamed from: oe.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4994c implements AbstractC6418g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6417f f41303a;

    public C4994c(C6417f c6417f) {
        this.f41303a = c6417f;
    }

    @Override // xe.AbstractC6418g
    public final boolean a(C6417f c6417f) {
        AbstractC3557B.c0("contentType", c6417f);
        return c6417f.b(this.f41303a);
    }
}
