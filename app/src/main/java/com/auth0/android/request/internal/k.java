package com.auth0.android.request.internal;

import I8.E;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.util.Base64;
import com.google.gson.reflect.TypeToken;
import id.AbstractC3557B;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kf.v;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Map f26736a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f26737b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f26738c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26739d;

    /* renamed from: e  reason: collision with root package name */
    public final String f26740e;

    /* renamed from: f  reason: collision with root package name */
    public final String f26741f;

    /* renamed from: g  reason: collision with root package name */
    public final String f26742g;

    /* renamed from: h  reason: collision with root package name */
    public final String f26743h;

    /* renamed from: i  reason: collision with root package name */
    public final String f26744i;

    /* renamed from: j  reason: collision with root package name */
    public final String f26745j;

    /* renamed from: k  reason: collision with root package name */
    public final Date f26746k;

    /* renamed from: l  reason: collision with root package name */
    public final Date f26747l;

    /* renamed from: m  reason: collision with root package name */
    public final String f26748m;

    /* renamed from: n  reason: collision with root package name */
    public final Date f26749n;

    /* renamed from: o  reason: collision with root package name */
    public final List f26750o;

    public k(String str) {
        Double d10;
        Date date;
        Double d11;
        Date date2;
        Double d12;
        List list;
        String[] strArr = (String[]) Lg.n.G2(str, new String[]{Separators.DOT}).toArray(new String[0]);
        if (strArr.length == 2 && Lg.n.c2(str, Separators.DOT, false)) {
            strArr = new String[]{strArr[0], strArr[1], ""};
        }
        if (strArr.length == 3) {
            this.f26738c = strArr;
            String str2 = strArr[0];
            AbstractC3557B.c0("encoded", str2);
            byte[] decode = Base64.decode(str2, 11);
            AbstractC3557B.b0("decode(encoded, Base64.U\u2026RAP or Base64.NO_PADDING)", decode);
            Charset charset = Lg.a.f11131a;
            String str3 = new String(decode, charset);
            String str4 = strArr[1];
            AbstractC3557B.c0("encoded", str4);
            byte[] decode2 = Base64.decode(str4, 11);
            AbstractC3557B.b0("decode(encoded, Base64.U\u2026RAP or Base64.NO_PADDING)", decode2);
            String str5 = new String(decode2, charset);
            E f6 = f.f26731a.f(new TypeToken<Map<String, ? extends Object>>() { // from class: com.auth0.android.request.internal.Jwt$mapAdapter$1
            });
            Object b10 = f6.b(new P8.b(new StringReader(str3)));
            AbstractC3557B.b0("mapAdapter.fromJson(jsonHeader)", b10);
            Map map = (Map) b10;
            this.f26736a = map;
            Object b11 = f6.b(new P8.b(new StringReader(str5)));
            AbstractC3557B.b0("mapAdapter.fromJson(jsonPayload)", b11);
            Map map2 = (Map) b11;
            this.f26737b = map2;
            Object obj = map.get(ParameterNamesIms.ALG);
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", obj);
            this.f26739d = (String) obj;
            this.f26740e = (String) map.get("kid");
            this.f26741f = (String) map2.get("sub");
            this.f26742g = (String) map2.get("iss");
            this.f26743h = (String) map2.get("nonce");
            this.f26744i = (String) map2.get("org_id");
            this.f26745j = (String) map2.get("org_name");
            Object obj2 = map2.get("iat");
            Date date3 = null;
            if (obj2 instanceof Double) {
                d10 = (Double) obj2;
            } else {
                d10 = null;
            }
            if (d10 != null) {
                date = new Date(((long) d10.doubleValue()) * 1000);
            } else {
                date = null;
            }
            this.f26746k = date;
            Object obj3 = map2.get("exp");
            if (obj3 instanceof Double) {
                d11 = (Double) obj3;
            } else {
                d11 = null;
            }
            if (d11 != null) {
                date2 = new Date(((long) d11.doubleValue()) * 1000);
            } else {
                date2 = null;
            }
            this.f26747l = date2;
            this.f26748m = (String) map2.get("azp");
            Object obj4 = map2.get("auth_time");
            if (obj4 instanceof Double) {
                d12 = (Double) obj4;
            } else {
                d12 = null;
            }
            this.f26749n = d12 != null ? new Date(((long) d12.doubleValue()) * 1000) : date3;
            Object obj5 = map2.get("aud");
            if (obj5 instanceof String) {
                list = AbstractC4344b.F0(obj5);
            } else if (obj5 instanceof List) {
                list = (List) obj5;
            } else {
                list = v.f37483Y;
            }
            this.f26750o = list;
            return;
        }
        throw new IllegalArgumentException(String.format("The token was expected to have 3 parts, but got %s.", Arrays.copyOf(new Object[]{Integer.valueOf(strArr.length)}, 1)));
    }
}
