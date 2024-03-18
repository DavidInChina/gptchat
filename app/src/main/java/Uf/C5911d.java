package uf;

import java.io.File;

/* renamed from: uf.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5911d extends AbstractC5914g {

    /* renamed from: b  reason: collision with root package name */
    public boolean f46749b;

    @Override // uf.AbstractC5914g
    public final File a() {
        if (this.f46749b) {
            return null;
        }
        this.f46749b = true;
        return this.f46756a;
    }
}
