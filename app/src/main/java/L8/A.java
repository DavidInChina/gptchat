package L8;

import I8.E;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes2.dex */
public abstract class A {

    /* renamed from: A  reason: collision with root package name */
    public static final x f10753A;

    /* renamed from: d  reason: collision with root package name */
    public static final y f10758d = b(Boolean.TYPE, Boolean.class, new I8.k(22));

    /* renamed from: p  reason: collision with root package name */
    public static final x f10770p = a(String.class, new I8.k(6));

    /* renamed from: z  reason: collision with root package name */
    public static final I8.k f10780z;

    /* renamed from: a  reason: collision with root package name */
    public static final x f10755a = a(Class.class, new I8.k(11).a());

    /* renamed from: b  reason: collision with root package name */
    public static final x f10756b = a(BitSet.class, new I8.k(21).a());

    /* renamed from: c  reason: collision with root package name */
    public static final I8.k f10757c = new I8.k(23);

    /* renamed from: e  reason: collision with root package name */
    public static final y f10759e = b(Byte.TYPE, Byte.class, new I8.k(24));

    /* renamed from: f  reason: collision with root package name */
    public static final y f10760f = b(Short.TYPE, Short.class, new I8.k(25));

    /* renamed from: g  reason: collision with root package name */
    public static final y f10761g = b(Integer.TYPE, Integer.class, new I8.k(26));

    /* renamed from: h  reason: collision with root package name */
    public static final x f10762h = a(AtomicInteger.class, new I8.k(27).a());

    /* renamed from: i  reason: collision with root package name */
    public static final x f10763i = a(AtomicBoolean.class, new I8.k(28).a());

    /* renamed from: j  reason: collision with root package name */
    public static final x f10764j = a(AtomicIntegerArray.class, new I8.k(1).a());

    /* renamed from: k  reason: collision with root package name */
    public static final I8.k f10765k = new I8.k(2);

    /* renamed from: l  reason: collision with root package name */
    public static final y f10766l = b(Character.TYPE, Character.class, new I8.k(5));

    /* renamed from: m  reason: collision with root package name */
    public static final I8.k f10767m = new I8.k(7);

    /* renamed from: n  reason: collision with root package name */
    public static final I8.k f10768n = new I8.k(8);

    /* renamed from: o  reason: collision with root package name */
    public static final I8.k f10769o = new I8.k(9);

    /* renamed from: q  reason: collision with root package name */
    public static final x f10771q = a(StringBuilder.class, new I8.k(10));

    /* renamed from: r  reason: collision with root package name */
    public static final x f10772r = a(StringBuffer.class, new I8.k(12));

    /* renamed from: s  reason: collision with root package name */
    public static final x f10773s = a(URL.class, new I8.k(13));

    /* renamed from: t  reason: collision with root package name */
    public static final x f10774t = a(URI.class, new I8.k(14));

    /* renamed from: u  reason: collision with root package name */
    public static final x f10775u = new x(InetAddress.class, new I8.k(15), 1);

    /* renamed from: v  reason: collision with root package name */
    public static final x f10776v = a(UUID.class, new I8.k(16));

    /* renamed from: w  reason: collision with root package name */
    public static final x f10777w = a(Currency.class, new I8.k(17).a());

    /* renamed from: x  reason: collision with root package name */
    public static final y f10778x = new y(Calendar.class, GregorianCalendar.class, new I8.k(18), 1);

    /* renamed from: y  reason: collision with root package name */
    public static final x f10779y = a(Locale.class, new I8.k(19));

    /* renamed from: B  reason: collision with root package name */
    public static final com.auth0.android.request.internal.i f10754B = new com.auth0.android.request.internal.i(3);

    static {
        I8.k kVar = new I8.k(20);
        f10780z = kVar;
        f10753A = new x(I8.r.class, kVar, 1);
    }

    public static x a(Class cls, E e10) {
        return new x(cls, e10, 0);
    }

    public static y b(Class cls, Class cls2, E e10) {
        return new y(cls, cls2, e10, 0);
    }
}
