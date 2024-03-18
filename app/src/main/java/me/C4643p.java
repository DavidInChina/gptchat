package me;

import he.C3418c;
import id.AbstractC3557B;
import java.io.InputStream;

/* renamed from: me.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4643p extends InputStream {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ InputStream f39225Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Ie.e f39226Z;

    public C4643p(io.ktor.utils.io.jvm.javaio.i iVar, Ie.e eVar) {
        this.f39225Y = iVar;
        this.f39226Z = eVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f39225Y.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f39225Y.close();
        AbstractC3557B.f0(((C3418c) this.f39226Z.f8578Y).d());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        AbstractC3557B.c0("b", bArr);
        return this.f39225Y.read(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f39225Y.read();
    }
}
