package okhttp3.internal.publicsuffix;

import Lg.n;
import R4.b;
import android.gov.nist.core.Separators;
import ei.l;
import ei.m;
import id.AbstractC3557B;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.C4116E;
import ji.u;
import kf.t;
import kotlin.Metadata;
import l8.AbstractC4344b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "ei/l", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f41490e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final List f41491f = AbstractC4344b.F0(Separators.STAR);

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f41492g = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f41493a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f41494b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f41495c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f41496d;

    public static List c(String str) {
        List F22 = n.F2(str, new char[]{'.'});
        if (AbstractC3557B.K(t.o2(F22), "")) {
            return t.a2(F22);
        }
        return F22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
        if (r3 <= 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
        r5 = (byte[][]) r4.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
        if (r10 >= r9) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
        r5[r10] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f41490e;
        r11 = r12.f41495c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
        if (r11 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
        r11 = ei.l.a(r11, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
        if (r11 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
        id.AbstractC3557B.C2("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
        if (r11 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c0, code lost:
        r3 = r3 - 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r5 >= r3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r7 = r12.f41496d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
        if (r7 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c8, code lost:
        r7 = ei.l.a(r7, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
        if (r7 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
        id.AbstractC3557B.C2("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d7, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00da, code lost:
        if (r7 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
        r3 = Lg.n.F2("!".concat(r7), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
        if (r8 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ed, code lost:
        if (r11 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ef, code lost:
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f41491f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f2, code lost:
        r4 = kf.v.f37483Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f4, code lost:
        if (r8 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f6, code lost:
        r5 = Lg.n.F2(r8, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ff, code lost:
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0100, code lost:
        if (r11 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
        r4 = Lg.n.F2(r11, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0112, code lost:
        if (r5.size() <= r4.size()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0114, code lost:
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0116, code lost:
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0121, code lost:
        if (r2.size() != r3.size()) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012d, code lost:
        if (((java.lang.String) r3.get(0)).charAt(0) == '!') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012f, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013a, code lost:
        if (((java.lang.String) r3.get(0)).charAt(0) != '!') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013c, code lost:
        r0 = r2.size() - r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0146, code lost:
        r0 = r2.size() - (r3.size() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0162, code lost:
        return Kg.m.l1(Kg.m.g1(kf.t.V1(c(r13)), r0), android.gov.nist.core.Separators.DOT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        AbstractC3557B.b0("unicodeDomain", unicode);
        List c10 = c(unicode);
        if (!this.f41493a.get() && this.f41493a.compareAndSet(false, true)) {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z10 = true;
                    } catch (IOException e10) {
                        m mVar = m.f29511a;
                        m.f29511a.getClass();
                        m.i(5, "Failed to read public suffix list", e10);
                        if (z10) {
                        }
                    }
                } finally {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        } else {
            try {
                this.f41494b.await();
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f41495c != null) {
            int size = c10.size();
            byte[][] bArr = new byte[size];
            for (int i10 = 0; i10 < size; i10++) {
                Charset charset = StandardCharsets.UTF_8;
                AbstractC3557B.b0("UTF_8", charset);
                byte[] bytes = ((String) c10.get(i10)).getBytes(charset);
                AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
                bArr[i10] = bytes;
            }
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    byte[] bArr2 = this.f41495c;
                    if (bArr2 != null) {
                        str2 = l.a(bArr2, bArr, i11);
                        if (str2 != null) {
                            break;
                        }
                        i11++;
                    } else {
                        AbstractC3557B.C2("publicSuffixListBytes");
                        throw null;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
        } else {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                return;
            }
            C4116E J10 = b.J(new u(b.Z1(resourceAsStream)));
            long readInt = J10.readInt();
            J10.J0(readInt);
            byte[] O10 = J10.f36672Z.O(readInt);
            long readInt2 = J10.readInt();
            J10.J0(readInt2);
            byte[] O11 = J10.f36672Z.O(readInt2);
            Ad.l.S(J10, null);
            synchronized (this) {
                this.f41495c = O10;
                this.f41496d = O11;
            }
        } finally {
            this.f41494b.countDown();
        }
    }
}
