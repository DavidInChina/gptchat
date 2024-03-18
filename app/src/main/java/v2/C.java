package v2;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.N;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class C extends AbstractC5964c {

    /* renamed from: e  reason: collision with root package name */
    public final Resources f47034e;

    /* renamed from: f  reason: collision with root package name */
    public final String f47035f;

    /* renamed from: g  reason: collision with root package name */
    public Uri f47036g;

    /* renamed from: h  reason: collision with root package name */
    public AssetFileDescriptor f47037h;

    /* renamed from: i  reason: collision with root package name */
    public io.sentry.instrumentation.file.d f47038i;

    /* renamed from: j  reason: collision with root package name */
    public long f47039j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f47040k;

    public C(Context context) {
        super(false);
        this.f47034e = context.getResources();
        this.f47035f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r3.matches("\\d+") != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    @Override // v2.AbstractC5969h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(l lVar) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long j6;
        String str;
        Uri normalizeScheme = lVar.f47095a.normalizeScheme();
        this.f47036g = normalizeScheme;
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Resources resources = this.f47034e;
        try {
            try {
                if (!equals) {
                    if (TextUtils.equals("android.resource", normalizeScheme.getScheme()) && normalizeScheme.getPathSegments().size() == 1) {
                        String lastPathSegment = normalizeScheme.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                        String path = normalizeScheme.getPath();
                        path.getClass();
                        if (path.startsWith(Separators.SLASH)) {
                            path = path.substring(1);
                        }
                        String host = normalizeScheme.getHost();
                        StringBuilder sb2 = new StringBuilder();
                        if (TextUtils.isEmpty(host)) {
                            str = "";
                        } else {
                            str = android.gov.nist.core.a.g(host, ":");
                        }
                        parseInt = resources.getIdentifier(R.a.t(sb2, str, path), "raw", this.f47035f);
                        if (parseInt == 0) {
                            throw new i(2005, "Resource not found.", null);
                        }
                        r();
                        openRawResourceFd = resources.openRawResourceFd(parseInt);
                        this.f47037h = openRawResourceFd;
                        if (openRawResourceFd == null) {
                            long length = openRawResourceFd.getLength();
                            FileDescriptor fileDescriptor = openRawResourceFd.getFileDescriptor();
                            io.sentry.instrumentation.file.d u10 = N.u(new FileInputStream(fileDescriptor), fileDescriptor);
                            this.f47038i = u10;
                            int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                            long j10 = lVar.f47100f;
                            try {
                                if (i10 != 0 && j10 > length) {
                                    throw new i(2008, null, null);
                                }
                                long startOffset = openRawResourceFd.getStartOffset();
                                long skip = u10.skip(startOffset + j10) - startOffset;
                                if (skip == j10) {
                                    if (i10 == 0) {
                                        FileChannel channel = u10.getChannel();
                                        if (channel.size() == 0) {
                                            this.f47039j = -1L;
                                        } else {
                                            long size = channel.size() - channel.position();
                                            this.f47039j = size;
                                            if (size < 0) {
                                                throw new i(2008, null, null);
                                            }
                                        }
                                    } else {
                                        long j11 = length - skip;
                                        this.f47039j = j11;
                                        if (j11 < 0) {
                                            throw new i(2008);
                                        }
                                    }
                                    long j12 = lVar.f47101g;
                                    int i11 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
                                    if (i11 != 0) {
                                        long j13 = this.f47039j;
                                        if (j13 == -1) {
                                            j6 = j12;
                                        } else {
                                            j6 = Math.min(j13, j12);
                                        }
                                        this.f47039j = j6;
                                    }
                                    this.f47040k = true;
                                    s(lVar);
                                    if (i11 == 0) {
                                        return this.f47039j;
                                    }
                                    return j12;
                                }
                                throw new i(2008, null, null);
                            } catch (B e10) {
                                throw e10;
                            } catch (IOException e11) {
                                throw new i(2000, null, e11);
                            }
                        }
                        throw new i(2000, "Resource is compressed: " + normalizeScheme, null);
                    }
                    throw new i(1004, "Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null);
                }
                openRawResourceFd = resources.openRawResourceFd(parseInt);
                this.f47037h = openRawResourceFd;
                if (openRawResourceFd == null) {
                }
            } catch (Resources.NotFoundException e12) {
                throw new i(2005, null, e12);
            }
            String lastPathSegment2 = normalizeScheme.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            r();
        } catch (NumberFormatException unused) {
            throw new i(1004, "Resource identifier must be an integer.", null);
        }
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        this.f47036g = null;
        try {
            try {
                io.sentry.instrumentation.file.d dVar = this.f47038i;
                if (dVar != null) {
                    dVar.close();
                }
                this.f47038i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f47037h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new i(2000, null, e10);
                    }
                } finally {
                    this.f47037h = null;
                    if (this.f47040k) {
                        this.f47040k = false;
                        q();
                    }
                }
            } catch (IOException e11) {
                throw new i(2000, null, e11);
            }
        } catch (Throwable th2) {
            this.f47038i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f47037h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f47037h = null;
                    if (this.f47040k) {
                        this.f47040k = false;
                        q();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new i(2000, null, e12);
                }
            } finally {
                this.f47037h = null;
                if (this.f47040k) {
                    this.f47040k = false;
                    q();
                }
            }
        }
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return this.f47036g;
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j6 = this.f47039j;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i11 = (int) Math.min(j6, i11);
            } catch (IOException e10) {
                throw new i(2000, null, e10);
            }
        }
        io.sentry.instrumentation.file.d dVar = this.f47038i;
        int i12 = AbstractC5530A.f45131a;
        int read = dVar.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f47039j == -1) {
                return -1;
            }
            throw new i(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j10 = this.f47039j;
        if (j10 != -1) {
            this.f47039j = j10 - read;
        }
        p(read);
        return read;
    }
}
