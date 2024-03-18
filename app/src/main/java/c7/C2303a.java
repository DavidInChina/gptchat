package c7;

import e7.k;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import nf.AbstractC4828h;

/* renamed from: c7.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2303a implements k {

    /* renamed from: c  reason: collision with root package name */
    public static final String f26327c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set f26328d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b7.b("proto"), new b7.b("json"))));

    /* renamed from: e  reason: collision with root package name */
    public static final C2303a f26329e;

    /* renamed from: a  reason: collision with root package name */
    public final String f26330a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26331b;

    static {
        String Y7 = AbstractC4828h.Y("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f26327c = Y7;
        AbstractC4828h.Y("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        AbstractC4828h.Y("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f26329e = new C2303a(Y7, null);
    }

    public C2303a(String str, String str2) {
        this.f26330a = str;
        this.f26331b = str2;
    }

    public static C2303a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C2303a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
