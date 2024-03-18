package Ah;

import java.net.URL;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: Ah.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0082a implements Enumeration {

    /* renamed from: Y  reason: collision with root package name */
    public URL f923Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Enumeration f924Z;

    public C0082a(URL url, Enumeration enumeration) {
        this.f923Y = url;
        this.f924Z = enumeration;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        if (this.f923Y != null && this.f924Z.hasMoreElements()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        if (this.f923Y != null) {
            Enumeration enumeration = this.f924Z;
            if (enumeration.hasMoreElements()) {
                try {
                    return this.f923Y;
                } finally {
                    this.f923Y = (URL) enumeration.nextElement();
                }
            }
        }
        throw new NoSuchElementException();
    }
}
