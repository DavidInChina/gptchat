package com.auth0.android.request.internal;

import I8.p;
import I8.q;
import I8.r;
import I8.t;
import I8.u;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.util.Base64;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kf.AbstractC4268D;

/* loaded from: classes2.dex */
public final class j implements q {
    @Override // I8.q
    public final Object a(r rVar, Type type, y7.b bVar) {
        AbstractC3557B.c0("json", rVar);
        AbstractC3557B.c0("typeOfT", type);
        AbstractC3557B.c0("context", bVar);
        if ((rVar instanceof u) && !(rVar instanceof t) && !((AbstractCollection) rVar.y().f8133Y.entrySet()).isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((p) rVar.y().f8133Y.get("keys")).f8131Y.iterator();
            while (it.hasNext()) {
                u y10 = ((r) it.next()).y();
                String str = (String) bVar.h(y10.q0("use"), String.class);
                if (AbstractC3557B.K("RS256", (String) bVar.h(y10.q0(ParameterNamesIms.ALG), String.class)) && AbstractC3557B.K("sig", str)) {
                    String str2 = (String) bVar.h(y10.q0("kty"), String.class);
                    String str3 = (String) bVar.h(y10.q0("kid"), String.class);
                    try {
                        PublicKey generatePublic = KeyFactory.getInstance(str2).generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decode((String) bVar.h(y10.q0("n"), String.class), 11)), new BigInteger(1, Base64.decode((String) bVar.h(y10.q0("e"), String.class), 11))));
                        AbstractC3557B.b0("keyId", str3);
                        AbstractC3557B.b0("pub", generatePublic);
                        linkedHashMap.put(str3, generatePublic);
                    } catch (NoSuchAlgorithmException e10) {
                        String simpleName = j.class.getSimpleName();
                        AbstractC3612c.d(simpleName, "Could not parse the JWK with ID " + str3, e10);
                    } catch (InvalidKeySpecException e11) {
                        String simpleName2 = j.class.getSimpleName();
                        AbstractC3612c.d(simpleName2, "Could not parse the JWK with ID " + str3, e11);
                    }
                }
            }
            return AbstractC4268D.l1(linkedHashMap);
        }
        throw new RuntimeException("jwks json must be a valid and non-empty json object");
    }
}
