package android.gov.nist.javax.sip.message;

import b.AbstractC2096f;
import c.AbstractC2230B;
import c.AbstractC2254i;
import c.AbstractC2255j;
import c.AbstractC2262q;
import c.AbstractC2267w;
import c.Y;
import c.d0;
import c.f0;
import d.AbstractC2561b;
import d.AbstractC2562c;
import java.util.List;

/* loaded from: classes.dex */
public interface MessageFactoryExt {
    MultipartMimeContent createMultipartMimeContent(AbstractC2262q abstractC2262q, String[] strArr, String[] strArr2, String[] strArr3);

    /* synthetic */ AbstractC2561b createRequest(AbstractC2096f abstractC2096f, String str, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B);

    /* synthetic */ AbstractC2561b createRequest(AbstractC2096f abstractC2096f, String str, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, AbstractC2262q abstractC2262q, Object obj);

    /* synthetic */ AbstractC2561b createRequest(AbstractC2096f abstractC2096f, String str, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, AbstractC2262q abstractC2262q, byte[] bArr);

    /* synthetic */ AbstractC2561b createRequest(String str);

    /* synthetic */ AbstractC2562c createResponse(int i10, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B);

    /* synthetic */ AbstractC2562c createResponse(int i10, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, AbstractC2262q abstractC2262q, Object obj);

    /* synthetic */ AbstractC2562c createResponse(int i10, AbstractC2255j abstractC2255j, AbstractC2254i abstractC2254i, AbstractC2267w abstractC2267w, d0 d0Var, List list, AbstractC2230B abstractC2230B, AbstractC2262q abstractC2262q, byte[] bArr);

    /* synthetic */ AbstractC2562c createResponse(int i10, AbstractC2561b abstractC2561b);

    /* synthetic */ AbstractC2562c createResponse(int i10, AbstractC2561b abstractC2561b, AbstractC2262q abstractC2262q, Object obj);

    /* synthetic */ AbstractC2562c createResponse(int i10, AbstractC2561b abstractC2561b, AbstractC2262q abstractC2262q, byte[] bArr);

    /* synthetic */ AbstractC2562c createResponse(String str);

    void setDefaultContentEncodingCharset(String str);

    void setDefaultServerHeader(Y y10);

    void setDefaultUserAgentHeader(f0 f0Var);
}
