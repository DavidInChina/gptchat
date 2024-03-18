package Lf;

import id.AbstractC3557B;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kf.AbstractC4273I;
import l8.AbstractC4344b;
import sg.EnumC5626c;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashSet f11124a = AbstractC4273I.v2(dg.q.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashSet f11125b;

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashSet f11126c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashSet f11127d;

    /* renamed from: e  reason: collision with root package name */
    public static final LinkedHashSet f11128e;

    /* renamed from: f  reason: collision with root package name */
    public static final LinkedHashSet f11129f;

    /* renamed from: g  reason: collision with root package name */
    public static final LinkedHashSet f11130g;

    static {
        List<EnumC5626c> G02 = AbstractC4344b.G0(EnumC5626c.BOOLEAN, EnumC5626c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC5626c enumC5626c : G02) {
            String b10 = enumC5626c.e().f().b();
            AbstractC3557B.b0("asString(...)", b10);
            StringBuilder sb2 = new StringBuilder();
            String str = enumC5626c.f45592Z;
            if (str != null) {
                sb2.append(str);
                sb2.append("Value()");
                sb2.append(enumC5626c.c());
                kf.s.N1(dg.q.f(b10, sb2.toString()), linkedHashSet);
            } else {
                EnumC5626c.a(11);
                throw null;
            }
        }
        f11125b = AbstractC4273I.u2(AbstractC4273I.u2(AbstractC4273I.u2(AbstractC4273I.u2(AbstractC4273I.u2(AbstractC4273I.u2(linkedHashSet, dg.q.g("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), dg.q.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), dg.q.f("Double", "isInfinite()Z", "isNaN()Z")), dg.q.f("Float", "isInfinite()Z", "isNaN()Z")), dg.q.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), dg.q.f("CharSequence", "isEmpty()Z"));
        f11126c = dg.q.g("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f11127d = AbstractC4273I.u2(AbstractC4273I.u2(AbstractC4273I.u2(AbstractC4273I.u2(AbstractC4273I.u2(AbstractC4273I.u2(dg.q.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), dg.q.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), dg.q.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), dg.q.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), dg.q.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), dg.q.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), dg.q.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f11128e = AbstractC4273I.u2(AbstractC4273I.u2(dg.q.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), dg.q.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), dg.q.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        EnumC5626c enumC5626c2 = EnumC5626c.BYTE;
        List<EnumC5626c> G03 = AbstractC4344b.G0(EnumC5626c.BOOLEAN, enumC5626c2, EnumC5626c.DOUBLE, EnumC5626c.FLOAT, enumC5626c2, EnumC5626c.INT, EnumC5626c.LONG, EnumC5626c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (EnumC5626c enumC5626c3 : G03) {
            String b11 = enumC5626c3.e().f().b();
            AbstractC3557B.b0("asString(...)", b11);
            String[] b12 = dg.q.b("Ljava/lang/String;");
            kf.s.N1(dg.q.f(b11, (String[]) Arrays.copyOf(b12, b12.length)), linkedHashSet2);
        }
        String[] b13 = dg.q.b("D");
        LinkedHashSet u22 = AbstractC4273I.u2(linkedHashSet2, dg.q.f("Float", (String[]) Arrays.copyOf(b13, b13.length)));
        String[] b14 = dg.q.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f11129f = AbstractC4273I.u2(u22, dg.q.f("String", (String[]) Arrays.copyOf(b14, b14.length)));
        String[] b15 = dg.q.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f11130g = dg.q.f("Throwable", (String[]) Arrays.copyOf(b15, b15.length));
    }
}
