package v2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.N;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import s2.AbstractC5530A;

/* renamed from: v2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5966e extends AbstractC5964c {

    /* renamed from: e  reason: collision with root package name */
    public final ContentResolver f47067e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f47068f;

    /* renamed from: g  reason: collision with root package name */
    public AssetFileDescriptor f47069g;

    /* renamed from: h  reason: collision with root package name */
    public io.sentry.instrumentation.file.d f47070h;

    /* renamed from: i  reason: collision with root package name */
    public long f47071i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f47072j;

    public C5966e(Context context) {
        super(false);
        this.f47067e = context.getContentResolver();
    }

    @Override // v2.AbstractC5969h
    public final long a(l lVar) {
        AssetFileDescriptor assetFileDescriptor;
        long j6;
        int i10 = 2000;
        try {
            Uri normalizeScheme = lVar.f47095a.normalizeScheme();
            this.f47068f = normalizeScheme;
            r();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f47067e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f47069g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
                io.sentry.instrumentation.file.d u10 = N.u(new FileInputStream(fileDescriptor), fileDescriptor);
                this.f47070h = u10;
                int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                long j10 = lVar.f47100f;
                if (i11 != 0 && j10 > length) {
                    throw new i(2008, (Throwable) null);
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long skip = u10.skip(startOffset + j10) - startOffset;
                if (skip == j10) {
                    if (i11 == 0) {
                        FileChannel channel = u10.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f47071i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f47071i = position;
                            if (position < 0) {
                                throw new i(2008, (Throwable) null);
                            }
                        }
                    } else {
                        long j11 = length - skip;
                        this.f47071i = j11;
                        if (j11 < 0) {
                            throw new i(2008, (Throwable) null);
                        }
                    }
                    long j12 = lVar.f47101g;
                    int i12 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
                    if (i12 != 0) {
                        long j13 = this.f47071i;
                        if (j13 == -1) {
                            j6 = j12;
                        } else {
                            j6 = Math.min(j13, j12);
                        }
                        this.f47071i = j6;
                    }
                    this.f47072j = true;
                    s(lVar);
                    if (i12 == 0) {
                        return this.f47071i;
                    }
                    return j12;
                }
                throw new i(2008, (Throwable) null);
            }
            throw new i(2000, new IOException("Could not open file descriptor for: " + normalizeScheme));
        } catch (C5965d e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new i(i10, e11);
        }
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        this.f47068f = null;
        try {
            try {
                io.sentry.instrumentation.file.d dVar = this.f47070h;
                if (dVar != null) {
                    dVar.close();
                }
                this.f47070h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f47069g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new i(2000, e10);
                    }
                } finally {
                    this.f47069g = null;
                    if (this.f47072j) {
                        this.f47072j = false;
                        q();
                    }
                }
            } catch (IOException e11) {
                throw new i(2000, e11);
            }
        } catch (Throwable th2) {
            this.f47070h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f47069g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f47069g = null;
                    if (this.f47072j) {
                        this.f47072j = false;
                        q();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new i(2000, e12);
                }
            } finally {
                this.f47069g = null;
                if (this.f47072j) {
                    this.f47072j = false;
                    q();
                }
            }
        }
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return this.f47068f;
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j6 = this.f47071i;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i11 = (int) Math.min(j6, i11);
            } catch (IOException e10) {
                throw new i(2000, e10);
            }
        }
        io.sentry.instrumentation.file.d dVar = this.f47070h;
        int i12 = AbstractC5530A.f45131a;
        int read = dVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f47071i;
        if (j10 != -1) {
            this.f47071i = j10 - read;
        }
        p(read);
        return read;
    }
}
