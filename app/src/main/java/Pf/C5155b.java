package pf;

import nf.AbstractC4825e;
import nf.AbstractC4831k;

/* renamed from: pf.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5155b implements AbstractC4825e {

    /* renamed from: Y  reason: collision with root package name */
    public static final C5155b f43136Y = new Object();

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
