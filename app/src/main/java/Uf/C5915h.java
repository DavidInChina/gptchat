package uf;

import id.AbstractC3557B;
import java.io.File;
import java.util.Iterator;

/* renamed from: uf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5915h implements Kg.k {

    /* renamed from: a  reason: collision with root package name */
    public final File f46757a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC5916i f46758b;

    /* renamed from: c  reason: collision with root package name */
    public final int f46759c = Integer.MAX_VALUE;

    public C5915h(File file) {
        EnumC5916i enumC5916i = EnumC5916i.f46760Y;
        AbstractC3557B.c0("start", file);
        this.f46757a = file;
        this.f46758b = enumC5916i;
    }

    @Override // Kg.k
    public final Iterator iterator() {
        return new C5913f(this);
    }
}
