<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : pass.xsl
    Created on : 24 March, 2021, 3:48 PM
    Author     : Web-Tech-Lab
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>pass.xsl</title>
            </head>
            <body>
		<table border="1">
		<tr><th>number</th><th>name</th>
		</tr>
		<xsl:for-each select="passport/application">
		<tr>
		<td><xsl:value-of select="no"/></td>
		<td><xsl:value-of select="name"/></td>
		</tr>
                </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
