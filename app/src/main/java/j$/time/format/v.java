package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class v implements AbstractC3713g {

    /* renamed from: c  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f35053c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f35054d;

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.t f35055a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35056b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(j$.time.temporal.t tVar, String str) {
        this.f35055a = tVar;
        this.f35056b = str;
    }

    private static int b(y yVar, CharSequence charSequence, int i10, int i11, m mVar) {
        String upperCase = charSequence.subSequence(i10, i11).toString().toUpperCase();
        if (i11 >= charSequence.length() || charSequence.charAt(i11) == '0' || yVar.b(charSequence.charAt(i11), 'Z')) {
            yVar.n(ZoneId.of(upperCase));
            return i11;
        }
        y d10 = yVar.d();
        int p10 = mVar.p(d10, charSequence, i11);
        try {
            if (p10 >= 0) {
                yVar.n(ZoneId.O(upperCase, ZoneOffset.V((int) d10.j(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return p10;
            } else if (mVar == m.f35025e) {
                return ~i10;
            } else {
                yVar.n(ZoneId.of(upperCase));
                return i11;
            }
        } catch (DateTimeException unused) {
            return ~i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p a(y yVar) {
        Set a5 = j$.time.zone.i.a();
        int size = a5.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = yVar.k() ? f35053c : f35054d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = yVar.k() ? f35053c : f35054d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), p.g(a5, yVar));
                        if (yVar.k()) {
                            f35053c = simpleImmutableEntry;
                        } else {
                            f35054d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (p) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.AbstractC3713g
    public boolean g(A a5, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) a5.f(this.f35055a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        if (i10 <= length) {
            if (i10 == length) {
                return ~i10;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt == '+' || charAt == '-') {
                return b(yVar, charSequence, i10, i10, m.f35025e);
            }
            int i12 = i10 + 2;
            if (length >= i12) {
                char charAt2 = charSequence.charAt(i10 + 1);
                if (yVar.b(charAt, 'U') && yVar.b(charAt2, 'T')) {
                    int i13 = i10 + 3;
                    return (length < i13 || !yVar.b(charSequence.charAt(i12), 'C')) ? b(yVar, charSequence, i10, i12, m.f35026f) : b(yVar, charSequence, i10, i13, m.f35026f);
                } else if (yVar.b(charAt, 'G') && length >= (i11 = i10 + 3) && yVar.b(charAt2, 'M') && yVar.b(charSequence.charAt(i12), 'T')) {
                    int i14 = i10 + 4;
                    if (length < i14 || !yVar.b(charSequence.charAt(i11), '0')) {
                        return b(yVar, charSequence, i10, i11, m.f35026f);
                    }
                    yVar.n(ZoneId.of("GMT0"));
                    return i14;
                }
            }
            p a5 = a(yVar);
            ParsePosition parsePosition = new ParsePosition(i10);
            String d10 = a5.d(charSequence, parsePosition);
            if (d10 != null) {
                yVar.n(ZoneId.of(d10));
                return parsePosition.getIndex();
            } else if (!yVar.b(charAt, 'Z')) {
                return ~i10;
            } else {
                yVar.n(ZoneOffset.UTC);
                return i10 + 1;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        return this.f35056b;
    }
}
