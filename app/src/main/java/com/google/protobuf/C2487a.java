package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.google.protobuf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2487a extends FilterInputStream {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27512Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f27513Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2487a(InputStream inputStream, int i10, int i11) {
        super(inputStream);
        this.f27512Y = i11;
        this.f27513Z = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f27512Y) {
            case 0:
                return Math.min(super.available(), this.f27513Z);
            default:
                return Math.min(super.available(), this.f27513Z);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i10 = -1;
        switch (this.f27512Y) {
            case 0:
                if (this.f27513Z > 0 && (i10 = super.read()) >= 0) {
                    this.f27513Z--;
                }
                return i10;
            default:
                if (this.f27513Z > 0 && (i10 = super.read()) >= 0) {
                    this.f27513Z--;
                }
                return i10;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) {
        switch (this.f27512Y) {
            case 0:
                int skip = (int) super.skip(Math.min(j6, this.f27513Z));
                if (skip >= 0) {
                    this.f27513Z -= skip;
                }
                return skip;
            default:
                long skip2 = super.skip(Math.min(j6, this.f27513Z));
                if (skip2 >= 0) {
                    this.f27513Z = (int) (this.f27513Z - skip2);
                }
                return skip2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = -1;
        switch (this.f27512Y) {
            case 0:
                int i13 = this.f27513Z;
                if (i13 > 0 && (i12 = super.read(bArr, i10, Math.min(i11, i13))) >= 0) {
                    this.f27513Z -= i12;
                }
                return i12;
            default:
                int i14 = this.f27513Z;
                if (i14 > 0 && (i12 = super.read(bArr, i10, Math.min(i11, i14))) >= 0) {
                    this.f27513Z -= i12;
                }
                return i12;
        }
    }
}
