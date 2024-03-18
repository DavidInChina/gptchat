package android.gov.nist.javax.sip.message;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.HeaderFactoryExt;
import android.gov.nist.javax.sip.header.HeaderFactoryImpl;
import c.AbstractC2258m;
import c.AbstractC2262q;
import c.AbstractC2268x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* loaded from: classes.dex */
public class MultipartMimeContentImpl implements MultipartMimeContent {
    public static final String BOUNDARY = "boundary";
    private String boundary;
    private List<Content> contentList = new LinkedList();
    private HeaderFactoryExt headerFactory = new HeaderFactoryImpl();
    private AbstractC2262q multipartMimeContentTypeHeader;

    public MultipartMimeContentImpl(AbstractC2262q abstractC2262q) {
        this.multipartMimeContentTypeHeader = abstractC2262q;
        this.boundary = abstractC2262q.getParameter(BOUNDARY);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ContentImpl parseBodyPart(String str) {
        String[] strArr;
        if (!str.startsWith(Separators.RETURN) && !str.startsWith(Separators.NEWLINE)) {
            String[] split = str.split("\r?\n\r?\n", 2);
            if (split.length == 2) {
                strArr = split[0].split("\r?\n");
                if (strArr[0].indexOf(":") > 0) {
                    str = split[1];
                    ContentImpl contentImpl = new ContentImpl(str);
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            AbstractC2268x createHeader = this.headerFactory.createHeader(str2);
                            if (createHeader instanceof AbstractC2262q) {
                                contentImpl.setContentTypeHeader((AbstractC2262q) createHeader);
                            } else if (createHeader instanceof AbstractC2258m) {
                                contentImpl.setContentDispositionHeader((AbstractC2258m) createHeader);
                            } else {
                                contentImpl.addExtensionHeader(createHeader);
                            }
                        }
                    }
                    return contentImpl;
                }
            }
        }
        strArr = null;
        ContentImpl contentImpl2 = new ContentImpl(str);
        if (strArr != null) {
        }
        return contentImpl2;
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public boolean add(Content content) {
        return this.contentList.add((ContentImpl) content);
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public void addContent(Content content) {
        add(content);
    }

    public void createContentList(String str) {
        if (this.boundary != null) {
            Scanner scanner = new Scanner(str);
            scanner.useDelimiter("\r?\n?--" + this.boundary + "(--)?\r?\n?");
            while (scanner.hasNext()) {
                try {
                    this.contentList.add(parseBodyPart(scanner.next()));
                } catch (NoSuchElementException unused) {
                }
            }
            return;
        }
        ContentImpl parseBodyPart = parseBodyPart(str);
        parseBodyPart.setContentTypeHeader(getContentTypeHeader());
        this.contentList.add(parseBodyPart);
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public int getContentCount() {
        return this.contentList.size();
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public AbstractC2262q getContentTypeHeader() {
        return this.multipartMimeContentTypeHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public Iterator<Content> getContents() {
        return this.contentList.iterator();
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Content content : this.contentList) {
            sb2.append("--" + this.boundary + Separators.NEWLINE);
            sb2.append(content.toString());
            sb2.append(Separators.NEWLINE);
        }
        if (!this.contentList.isEmpty()) {
            sb2.append("--" + this.boundary + "--");
        }
        return sb2.toString();
    }
}
